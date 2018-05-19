import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class TestGetTestFromDB {


    @Mock
    private CustomerDao daoMock;

    @InjectMocks
    private CustomerService service;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);

        Customer customer = new Customer();
    }

    @Test
    public void testAddCustomer_returnsNewCustomer() {

        Customer c = new Customer();
        when(daoMock.save(any(Customer.class))).thenReturn(c);

        Customer customer = new Customer();

        assertThat(service.addCustomer(customer), is(notNullValue()));

    }
}
