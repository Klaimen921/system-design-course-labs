package fotius.example.donations.webhook.domain;

import fotius.example.donations.payment.domain.model.PaymentMethod;
import fotius.example.donations.payment.domain.model.PaymentState;
import fotius.example.donations.webhook.domain.model.Webhook;

import java.util.List;

public interface WebhookRepository {
    void insert(Webhook webhook);

    void delete(Long id);

    List<Webhook> getAll();

    List<Webhook> getState(PaymentMethod method, PaymentState state);

    List<Webhook> getAllByUserId(Long userId);
}