package girardtechie.azurespringwebapp.controller;

import girardtechie.azurespringwebapp.data.Districts;
import girardtechie.azurespringwebapp.service.DistrictServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WebServiceController {
    private final DistrictServices districtServices;

    public WebServiceController(DistrictServices districtServices) {
        this.districtServices = districtServices;
    }

    @GetMapping("/districts")
    public List<Districts> getDistricts(){
        return this.districtServices.getDistricts();
    }

}
