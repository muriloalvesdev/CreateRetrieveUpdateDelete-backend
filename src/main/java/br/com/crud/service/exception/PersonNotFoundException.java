package br.com.crud.service.exception;

public class PersonNotFoundException extends RuntimeException {

  private static final long serialVersionUID = 7112832640247494726L;

  public PersonNotFoundException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public PersonNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }

  public PersonNotFoundException(String message) {
    super(message);
  }

  public PersonNotFoundException(Throwable cause) {
    super(cause);
  }

}
