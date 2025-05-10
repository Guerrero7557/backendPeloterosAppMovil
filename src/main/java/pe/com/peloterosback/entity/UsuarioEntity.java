package pe.com.peloterosback.entity;

import java.io.Serializable;

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
@Table(name = "usuario")
public class UsuarioEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = true,nullable = false)
	private String nombre;
	
	@Column(unique = true,nullable = false)
	private String correo;
	
	@Column
	private String telefono;
	
	@Column(unique = true,nullable = false,length = 60)
	private String password;
	
//	@ManyToOne
//	@JsonBackReference("roles-usuarios")
//	@JoinColumn(name = "RoleID",nullable = false)
//	private Roles rolesObj;
//	
//	@OneToMany(mappedBy = "usuariosObj")
//	@JsonManagedReference("usuarios-reservas")
//	private Collection<Reservas> itemReservas=new ArrayList<>();
}
