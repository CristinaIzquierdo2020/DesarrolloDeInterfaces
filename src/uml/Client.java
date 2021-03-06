package uml;

public class Client {
	
	//Referencia a la tabla Cliente de la base de datos Jardineria
	private int codigoCliente;
	private String nombreCliente;
	private String nombreContacto;
	private String apellidoContacto;
	private String telefono;
	private String fax;
	private String lineaDireccion1;
	private String lineaDireccion2;
	private String ciudad;
	private String region;
	private String pais;
	private String codigoPostal;
	private int codigoEmpleadoRepVentas;
	private int limiteCredito;
	
	
	//Constructores
	public Client() {
	}
	
	
	
		
	public Client(int codigoCliente, String nombreCliente, String apellidoContacto, String telefono) {
		this.codigoCliente = codigoCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoContacto = apellidoContacto;
		this.telefono = telefono;
	}




	public Client(int codigoCliente, String nombreCliente, String nombreContacto, String apellidoContacto,
			String telefono, String fax, String lineaDireccion1, String lineaDireccion2, String ciudad, String region,
			String pais, String codigoPostal, int codigoEmpleadoRepVentas, int limiteCredito) {
		this.codigoCliente = codigoCliente;
		this.nombreCliente = nombreCliente;
		this.nombreContacto = nombreContacto;
		this.apellidoContacto = apellidoContacto;
		this.telefono = telefono;
		this.fax = fax;
		this.lineaDireccion1 = lineaDireccion1;
		this.lineaDireccion2 = lineaDireccion2;
		this.ciudad = ciudad;
		this.region = region;
		this.pais = pais;
		this.codigoPostal = codigoPostal;
		this.codigoEmpleadoRepVentas = codigoEmpleadoRepVentas;
		this.limiteCredito = limiteCredito;
	}

	//Getters y Setters
	public int getCodigoCliente() {
		return codigoCliente;
	}


	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public String getNombreContacto() {
		return nombreContacto;
	}


	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}


	public String getApellidoContacto() {
		return apellidoContacto;
	}


	public void setApellidoContacto(String apellidoContacto) {
		this.apellidoContacto = apellidoContacto;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getFax() {
		return fax;
	}


	public void setFax(String fax) {
		this.fax = fax;
	}


	public String getLineaDireccion1() {
		return lineaDireccion1;
	}


	public void setLineaDireccion1(String lineaDireccion1) {
		this.lineaDireccion1 = lineaDireccion1;
	}


	public String getLineaDireccion2() {
		return lineaDireccion2;
	}


	public void setLineaDireccion2(String lineaDireccion2) {
		this.lineaDireccion2 = lineaDireccion2;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getCodigoPostal() {
		return codigoPostal;
	}


	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public int getCodigoEmpleadoRepVentas() {
		return codigoEmpleadoRepVentas;
	}


	public void setCodigoEmpleadoRepVentas(int codigoEmpleadoRepVentas) {
		this.codigoEmpleadoRepVentas = codigoEmpleadoRepVentas;
	}


	public int getLimiteCredito() {
		return limiteCredito;
	}


	public void setLimiteCredito(int limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	
	
	


	
	
	


	

}
