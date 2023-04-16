package fotius.example.donations.payment.domain;

import fotius.example.donations.payment.domain.model.Payment;

public interface PaymentChangeJoiner {
    void onChanged(Payment changed);
}
