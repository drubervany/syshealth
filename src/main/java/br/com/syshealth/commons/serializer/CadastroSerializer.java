package br.com.syshealth.commons.serializer;

import java.util.List;

public class CadastroSerializer {

	private Integer competencia;
	private List<SeguradoSerializer> segurados;

	public CadastroSerializer() {
	}

	private CadastroSerializer(Builder builder) {
		this.competencia = builder.competencia;
		this.segurados = builder.segurados;
	}

	public List<SeguradoSerializer> getSegurados() {
		return segurados;
	}

	public Integer getCompetencia() {
		return competencia;
	}

	/**
	 * Creates builder to build {@link CadastroSerializer}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link CadastroSerializer}.
	 */
	public static final class Builder {
		private Integer competencia;
		private List<SeguradoSerializer> segurados;

		private Builder() {
		}

		public Builder withCompetencia(Integer competencia) {
			this.competencia = competencia;
			return this;
		}

		public Builder withSegurados(List<SeguradoSerializer> segurados) {
			this.segurados = segurados;
			return this;
		}

		public CadastroSerializer build() {
			return new CadastroSerializer(this);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((competencia == null) ? 0 : competencia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroSerializer other = (CadastroSerializer) obj;
		if (competencia == null) {
			if (other.competencia != null)
				return false;
		} else if (!competencia.equals(other.competencia))
			return false;
		return true;
	}
}
