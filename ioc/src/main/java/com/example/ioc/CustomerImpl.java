package ioc.src.main.java.com.example.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerImpl implements Customer{

    // Field Injection
//    @Autowired
    private CreditCard creditCard;

    // Constructor Injection
    @Autowired
    CustomerImpl(CreditCard creditCard){
        this.creditCard = creditCard;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    // Setter Injection
//    @Autowired
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }



    @Override
    public void pay() {
        creditCard.makePayment();
    }
}
