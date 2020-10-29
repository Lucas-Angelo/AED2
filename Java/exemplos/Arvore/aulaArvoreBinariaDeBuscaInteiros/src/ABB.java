public class ABB {

	No raiz;

	public ABB() {
		raiz = null;
	}

	public boolean arvoreVazia() {
		boolean resp;
		if (raiz == null)
			resp = true;
		else
			resp = false;

		return resp;
	}

}
