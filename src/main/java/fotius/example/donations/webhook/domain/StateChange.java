package fotius.example.donations.webhook.domain;

import fotius.example.donations.payment.domain.PaymentChangeJoiner;
import fotius.example.donations.payment.domain.model.Payment;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class StateChange implements PaymentChangeJoiner {

    private final WebhookService webhookService;

    @Override
    public void onChanged(Payment changed) {
        webhookService
                .getState(changed.getMethod(), changed.getState())
                .forEach(x -> {
                    System.out.println("Payment " + changed.getId() + " changed. "
                            + "Payment method: " + changed.getMethod() + "; "
                            + "Payment state: " + changed.getState() + ";");
                });
    }
}