/**
 * 
 */
package com.prafullranjan.code.exception;

import java.util.Date;
/**
 * ErrorMessage
 * 
 * @author Prafull
 */
public class ErrorMessage {
  private int status;
  private Date timestamp;
  private String message;
  private String path;
  private String error;

  public ErrorMessage(int status, Date timestamp, String message, String path, String error) {
    this.status = status;
    this.timestamp = timestamp;
    this.message = message;
    this.path = path;
    this.error = error;
  }

  public int getStatus() {
    return status;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public String getMessage() {
    return message;
  }
  
  public String getPath() {
	return path;
  }

  public String getError() {
    return error;
  }
}