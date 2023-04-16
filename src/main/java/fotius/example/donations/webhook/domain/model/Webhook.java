package fotius.example.donations.webhook.domain.model;

import fotius.example.donations.payment.domain.model.PaymentMethod;
import fotius.example.donations.payment.domain.model.PaymentState;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.net.URL;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class Webhook {
    private Long id;
    private Long userId;
    private URL targetUrl;
    private PaymentMethod paymentMethod;
    private PaymentState paymentState;
}