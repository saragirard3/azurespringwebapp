package girardtechie.azurespringwebapp.service;

import girardtechie.azurespringwebapp.data.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class DistrictServices {
    private final UsersRepository usersRepository;
    private final ExpenseRepository expenseRepository;
    private final RevenueRepository revenueRepository;
    private final AdmRepository admRepository;
    private final DistrictsRepository districtsRepository;

    public DistrictServices(UsersRepository usersRepository, ExpenseRepository expenseRepository, RevenueRepository revenueRepository, AdmRepository admRepository, DistrictsRepository districtsRepository){
        this.usersRepository = usersRepository;
        this.expenseRepository = expenseRepository;
        this.revenueRepository = revenueRepository;
        this.admRepository = admRepository;
        this.districtsRepository = districtsRepository;
    }

    public List<Districts> getDistricts() {
        Iterable<Districts> districts = this.districtsRepository.findAll();
        List<Districts> districtsList = new ArrayList<>();
        districts.forEach(district->{districtsList.add(district);});
        districtsList.sort(new Comparator<Districts>() {
            @Override
            public int compare(Districts o1, Districts o2) {
                return o1.getDistId().compareTo(o2.getDistId());
            }
        });
        return districtsList;
    }
//
//    public List<Users> getUsers() {
//        Iterable<Users> users = this.usersRepository.findAll();
//        List<Users> usersList = new ArrayList<>();
//        users.forEach(user->{usersList.add(user);});
//        usersList.sort(new Comparator<Users>() {
//            @Override
//            public int compare(Users o1, Users o2) {
//                return o1.getUserName().compareTo(o2.getUserName());
//            }
//        });
//        return usersList;
//    }

}
