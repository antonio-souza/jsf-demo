package br.com.aaas.jsfdemo.web;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.aaas.jsfdemo.service.PrincipalService;

@Named
@ViewScoped
public class PrincipalMB implements Serializable {

  private static final long serialVersionUID = 1L;

  @Inject
  private PrincipalService  principalService;

  private String            mensagem;

  @PostConstruct
  private void initRN() {
    this.mensagem = principalService.consultar();
  }

  public String getMensagem() {
    return mensagem;
  }

  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }
}
