package progetto.mp.ligabue.martin;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class BankTest {
    @Test
    public void testBank() {
        Bank bank = new Bank();
        assertThat(bank.moneyAvailable).isEqualTo(0);
        assertThat(bank.safeStatus).isEqualTo(false);
        assertThat(bank.tellers).isNotNull();
        assertThat(bank.customers).isNotNull();
    }
}
