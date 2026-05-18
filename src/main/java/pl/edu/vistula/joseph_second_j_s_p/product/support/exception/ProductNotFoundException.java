package pl.edu.vistula.joseph_second_j_s_p.product.support.exception;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(Long id) {
        super(String.format("Product with %d not found", id));
    }
}