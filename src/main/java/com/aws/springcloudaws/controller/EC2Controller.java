package com.aws.springcloudaws.controller;

import com.aws.springcloudaws.config.EC2Metadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EC2Controller {


    @Autowired
    private EC2Metadata ec2Metadata;


    @GetMapping("/metadata")
    public EC2Metadata getMetadata() {
        return ec2Metadata;
    }
}
