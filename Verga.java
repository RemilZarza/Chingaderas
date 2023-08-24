

class verga{
	//atributos
	protected float largo, radio;
	private float volumenBolas;
	private bool teamSangre

	//operadores
	bool tenerGanas(float liquidosConsumidos){
		if(liquidosConsumidos>=(volumenBolas/2.0)){
			return true;
		}else{
			return false;
		}
	}

	float mear(float liquidosConsumidos){
		float cantidadChorro;
		if(tenerGanas(liquidosConsumidos)){
			chorro = liquidosConsumidos;
			liquidosConsumidos = 0;
		}
		return cantidadChorro;
	}

	float erectarRadio(float radio, bool teamSangre){
		if(teamSangre){

		}else{

		}
	}

	float erectarLargo(float largo, bool teamSangre){
		if(teamSangre){
			return largo*3.0
		}else{
			return largo*1.5
		}
	}
}