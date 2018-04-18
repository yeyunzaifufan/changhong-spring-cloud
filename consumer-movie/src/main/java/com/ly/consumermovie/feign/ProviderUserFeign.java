package com.ly.consumermovie.feign;

import com.ly.consumermovie.responsemodel.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "provider-user")
public interface ProviderUserFeign {

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User findUserById(@PathVariable("id") Long id);
}
