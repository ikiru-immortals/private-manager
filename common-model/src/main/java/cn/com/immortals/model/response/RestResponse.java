package cn.com.immortals.model.response;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;

/**
 * @author Immortals.
 * @version 1.0.0
 */
public class RestResponse {

    public enum ReturnStatus {
        SUCCESS, ERROR
    }

    public RestResponse() {
        this.status = ReturnStatus.SUCCESS;
    }

    private ReturnStatus status;

    private Object responseBody;

    private Collection responseCollection;

    private Date timeStamp;

    public ReturnStatus getStatus() {
        return status;
    }

    public void setStatus(ReturnStatus status) {
        this.status = status;
    }

    public Object getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(Object responseBody) {
        this.responseBody = responseBody;
    }

    public Collection getResponseCollection() {
        return responseCollection;
    }

    public void setResponseCollection(Collection responseCollection) {
        this.responseCollection = responseCollection;
    }

    public boolean isOk() {
        return this.status == ReturnStatus.SUCCESS;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
