package com.ly.consumermovie.controller;

import com.ly.consumermovie.feign.ProviderUserFeign;
import com.ly.consumermovie.responsemodel.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/movie")
public class MovieController {

    private static final Logger logger = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private ProviderUserFeign providerUserFeign;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        //return this.restTemplate.getForObject("http://provider-user/user/" + id, User.class);
        return providerUserFeign.findUserById(id);
    }

    @GetMapping("/log-instance")
    public void logUserinstance(){
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("provider-user");
        logger.info("----{}:{}:{}--------", serviceInstance.getServiceId(),serviceInstance.getHost(),serviceInstance.getPort());
    }
}
