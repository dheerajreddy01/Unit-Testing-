import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import com.acetech.Movie;
import com.acetech.RentalCart;
import com.acetech.RentalService;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

public class RentalCartTest {

    private RentalService rentalServiceMock;
    private RentalCart rentalCart;

    @Before
    public void setUp() {
        rentalServiceMock = mock(RentalService.class);
        rentalCart = new RentalCart();
        rentalCart.setRentalService(rentalServiceMock);
    }

    @Test
    public void testGetTotalPrice() {
        Movie movie1 = new Movie("1", "Old Movie", "1995", 3);
        Movie movie2 = new Movie("2", "Middle Movie", "2005", 2);
        Movie movie3 = new Movie("3", "New Movie", "2022", 1);

        when(rentalServiceMock.getRentalPrice(movie1)).thenReturn(2.0);
        when(rentalServiceMock.calculateLateFee(2.0, 3)).thenReturn(2.0 * 0.05 * 3);

        when(rentalServiceMock.getRentalPrice(movie2)).thenReturn(5.0);
        when(rentalServiceMock.calculateLateFee(5.0, 2)).thenReturn(5.0 * 0.10 * 2);

        when(rentalServiceMock.getRentalPrice(movie3)).thenReturn(10.0);
        when(rentalServiceMock.calculateLateFee(10.0, 1)).thenReturn(10.0 * 0.20 * 1);

        rentalCart.setMovies(Arrays.asList(movie1, movie2, movie3));

        double totalPrice = rentalCart.getTotalPrice();

        assertEquals(20.3, totalPrice, 0.001);
    }
}
