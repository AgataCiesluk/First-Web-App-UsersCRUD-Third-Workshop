package pl.coderslab.entity;

public class DaoException extends RuntimeException {
    public DaoException(String message, Exception ex){
        super(message,ex);
    }
    public DaoException (String message) {
        super(message);
    }
}
