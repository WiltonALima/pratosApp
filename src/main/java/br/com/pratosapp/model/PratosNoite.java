package br.com.pratosapp.model;
public enum PratosNoite {CARNE("1", "Carne"), BATATA("2", "Batata"), VINHO("3", "Vinho"), BOLO("4", "Bolo");
		private String codigo;
		private String nome;
		private PratosNoite(String codigo, String nome) {
			this.codigo = codigo;
			this.nome = nome;
		}
		public String getCodigo() {
			return codigo;
		}
		public String getNome() {
			return nome;
		}
		
		public static PratosNoite fromCodigo(String opcao) {
			for (PratosNoite prato : PratosNoite.values()) {
				if (opcao.equals(prato.getCodigo())) {
					return prato;
				}
			}
			return null;
		}
	}