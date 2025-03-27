package controller;

import model.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.BuyRepository;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping
public class EciCreditController {

    @Autowired
    private BuyRepository repository;

    @PostMapping
    public Purchase savePurchase(@RequestBody Purchase purchase){
        return repository.save(purchase);
    }

    @GetMapping
    public List<Purchase> obtainPurchases(){
        return repository.findAll();
    }


}
