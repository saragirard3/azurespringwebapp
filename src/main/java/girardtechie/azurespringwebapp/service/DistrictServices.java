package girardtechie.azurespringwebapp.service;

import girardtechie.azurespringwebapp.data.*;

public class DistrictServices {
    private final UsersRespository usersRespository;
    private final ExpenseRepository expenseRepository;
    private final RevenueRepository revenueRepository;
    private final AdmRepository admRepository;
    private final DistrictsRepository districtsRepository;

    public DistrictServices(UsersRespository usersRespository, ExpenseRepository expenseRepository, RevenueRepository revenueRepository, AdmRepository admRepository, DistrictsRepository districtsRepository){
        this.usersRespository = usersRespository;
        this.expenseRepository = expenseRepository;
        this.revenueRepository = revenueRepository;
        this.admRepository = admRepository;
        this.districtsRepository = districtsRepository;
    }


}
