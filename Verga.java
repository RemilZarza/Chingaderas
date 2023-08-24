

class verga{
	//atributos
	protected float largo, radio;
	private float volumenBolas;

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

	float erectar(float largo, float radio){

	}
}