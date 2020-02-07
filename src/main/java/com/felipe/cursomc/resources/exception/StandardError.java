package com.felipe.cursomc.resources.exception;

import java.io.Serializable;

public class StandardError  implements Serializable{

	private static final long serialVersionUID = 8886292107957451665L;

	private int status;
	private Long timeStamp;
	private String mensagem;

	public StandardError(int status, String mensagem,Long timeStamp ) {
		super();
		this.status = status;
		this.timeStamp = timeStamp;
		this.mensagem = mensagem;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	

	
}
