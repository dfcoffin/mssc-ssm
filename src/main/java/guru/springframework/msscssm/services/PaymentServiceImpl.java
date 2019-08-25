package guru.springframework.msscssm.services;

import guru.springframework.msscssm.domain.Payment;
import guru.springframework.msscssm.domain.PaymentEvent;
import guru.springframework.msscssm.domain.PaymentState;
import guru.springframework.msscssm.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineFactory;
import org.springframework.stereotype.Service;

/**
 * Created by Donald F. Coffin on 08/25/2019 at 05:02
 */
@RequiredArgsConstructor
@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final StateMachineFactory<PaymentState, PaymentEvent> stateMachineFactory;

    @Override
    public Payment newPayment(Payment payment) {
        payment.setState(PaymentState.NEW);
        return paymentRepository.save(payment);
    }

    @Override
    public StateMachine<PaymentService, PaymentEvent> preAuth(Long paymentId) {
        return null;
    }

    @Override
    public StateMachine<PaymentService, PaymentEvent> authorizePayment(Long paymentId) {
        return null;
    }

    @Override
    public StateMachine<PaymentService, PaymentEvent> declineAuth(Long paymentId) {
        return null;
    }
}
