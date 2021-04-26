package br.com.aaas.jsfdemo.service;

import java.io.Serializable;

public class PrincipalService implements Serializable {

  private static final long serialVersionUID = 1L;

  public String consultar() {
    return "Olá Mundo!";
  }
}
