
public class Sabonete {

		String cor;
		String cheiro;
		
		public Sabonete(String cor, String cheiro) { //construtor que chama a variavel direto
			super();
			//indicando qual a cor e cheiro 
			this.cor = cor;
			this.cheiro = cheiro;
		}
		@Override
		public String toString() { //como ela vai aparecer na lista
			return "Sabonete [cor=" + cor + ", cheiro=" + cheiro + "]\n";
		}		
		
		
		
	}

