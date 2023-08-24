

class Verga{
	//atributos
	protected float largo, radio;
	private float volumenBolas;
	private boolean teamSangre;

	//operadores
	boolean tenerGanas(float liquidosConsumidos){
		if(liquidosConsumidos>=(volumenBolas/2.0)){
			return true;
		}else{
			return false;
		}
	}

	float mear(float liquidosConsumidos){
		float cantidadChorro = 0;
		if(tenerGanas(liquidosConsumidos)){
			cantidadChorro = liquidosConsumidos;
			liquidosConsumidos = 0;
		}
		return cantidadChorro;
	}

	float erectarRadio(float radio, boolean teamSangre){
		if(teamSangre){
			return radio*(float)2.0;
		}else{
			return radio*(float)1.1;
		}
	}

	float erectarLargo(float largo, boolean teamSangre){
		if(teamSangre){
			return largo*(float)3.0;
		}else{
			return largo*(float)1.25;
		}
	}
}
