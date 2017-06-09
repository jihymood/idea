package zhab.restcontrol;

public class ResponseObj<T> {

	public ResponseObj() {

	}

	public ResponseObj(T data) {
		this.data = data;
	}

	public ResponseObj(T data, int errCode, String errMessage) {
		this.data = data;
		this.error = new Error(errCode, errMessage);
	}



	public ResponseObj(T data, Error error) {
		this.data = data;
		this.error = error;
	}


	public ResponseObj(String errMessage) {
		this.data = null;
		this.error = new Error(-1, errMessage);
	}

	public T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	public Error error;


}
