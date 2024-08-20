package com.cloudVender.api.controller;

import com.cloudVender.api.model.CloudVender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class
cloudVenderApiService {
    CloudVender cloudVender;

@GetMapping("{venderId}")
    public CloudVender getCloudVenderDetails(String venderId){
        return  cloudVender;
    }

    @PostMapping
    public String createCloudVenderDetails(@RequestBody CloudVender cloudVender){
        this.cloudVender = cloudVender;
        return "Cloud Vender created Sucessfully";
    }

    @PutMapping
    public String updateCloudVenderDetails(@RequestBody CloudVender cloudVender){
        this.cloudVender = cloudVender;
        return "Cloud Vender value updated Sucessfully";
    }

    @DeleteMapping("{venderid}")
    public String deleteCloudVenderDetails(String venderid){
        this.cloudVender = null;
        return "Cloud Vender value deleted Sucessfully";
    }
}
