package girardtechie.azurespringwebapp.controller;

import girardtechie.azurespringwebapp.data.Districts;
import girardtechie.azurespringwebapp.service.DistrictServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/districts")
public class DistrictController {
    private final DistrictServices districtServices;

    public DistrictController(DistrictServices districtServices) {
        this.districtServices = districtServices;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getDistName(Model model){
        model.addAttribute("districts",this.districtServices.getDistricts());
        return "index";
    }

    //    @Controller
//    @RequestMapping("/guests")
//    public class GuestController {
//        private final ReservationService reservationService;
//
//        public GuestController(ReservationService reservationService) {
//            this.reservationService = reservationService;
//        }
//
//        @RequestMapping(method = RequestMethod.GET)
//        public String getGuests(Model model){
//            model.addAttribute("guests", this.reservationService.getHotelGuests());
//            return "hotel-guests";
//        }
//    }

}
