package br.com.pratosapp.model;
public enum PratosManha {OVO("1", "Ovo"), TORRADA("2", "Torrada"), CAFE("3", "Café");
		private String codigo;
		private String nome;
		private PratosManha(String codigo, String nome) {
			this.codigo = codigo;
			this.nome = nome;
		}
		public String getCodigo() {
			return codigo;
		}
		public String getNome() {
			return nome;
		}
		public static PratosManha fromCodigo( String opcao) {
			for (PratosManha prato : PratosManha.values()) {
				if (opcao.equals(prato.getCodigo())) {
					return prato;
				}
			}
			return null;
		}
	}