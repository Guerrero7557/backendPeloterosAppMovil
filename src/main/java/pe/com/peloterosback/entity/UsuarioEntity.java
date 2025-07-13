package pe.com.peloterosback.entity;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@Table(name = "Usuarios")
public class UsuarioEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long usuario_id;
	
	
	@Column(name = "rol_id", nullable = false)	
	private Long rol_id;
	
	@Column(nullable = false)
	private String nombre;
	
	@Column(unique = true,nullable = false)
	private String correo;
	
	@Column(nullable = false)
	private String contrasenia_hash;
	
	@Column(nullable = false)	
	private Integer tipo_usuario;
	
	@Column
	private String telefono;
	
	@Column 
	private Timestamp fecha_registro;

	@Column
	private Blob foto_perfil;
	
	@Column(nullable = false)
	private Boolean estado;
	
//	@ManyToOne
//	@JsonBackReference("roles-usuarios")
//	@JoinColumn(name = "RoleID",nullable = false)
//	private Roles rolesObj;
//	
//	@OneToMany(mappedBy = "usuariosObj")
//	@JsonManagedReference("usuarios-reservas")
//	private Collection<Reservas> itemReservas=new ArrayList<>();
}
