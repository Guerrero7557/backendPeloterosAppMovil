package pe.com.peloterosback.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import pe.com.peloterosback.entity.UsuarioEntity;
import pe.com.peloterosback.repository.UsuarioRepository;
//import org.springframework.security.crypto.password.PasswordEncoder;



public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
    private UsuarioRepository UsuRep; 
    
    //@Autowired
    //private PasswordEncoder passwordEncoder;

    @Override
    public List<UsuarioEntity> findAll() {
        return UsuRep.findAll();
    }
    
    /*

    @Override
    public List<UsuarioEntity> findAllCustom() {
        return UsuRep.findAllCustom();
    }*/

    @Override
    public Optional<UsuarioEntity> findById(Long id) {
        return UsuRep.findById(id);
    }
    /*
    @Override
    public Optional<UsuarioEntity> findOnebyEmail(String xemail) {
        return UsuRep.findOnebyEmail(xemail);
    }*/

    @Override
    public UsuarioEntity add(UsuarioEntity u) {
        //UsuarioEntity usuario = new UsuarioEntity();
        //u.setPassword(passwordEncoder.encode(u.getPassword()));
        return UsuRep.save(u);
    }

    @Override
    public UsuarioEntity update(UsuarioEntity u) {
        UsuarioEntity objusuario = UsuRep.getById(u.getUsuario_id());
        //objusuario.setPassword(passwordEncoder.encode(u.getPassword()));
        BeanUtils.copyProperties(u, objusuario);
        return UsuRep.save(objusuario);
    }

    @Override
    public UsuarioEntity delete(UsuarioEntity u) {
        UsuarioEntity objusuario = UsuRep.getById(u.getUsuario_id());
        objusuario.setEstado(false);
        return UsuRep.save(objusuario);
    }

}
