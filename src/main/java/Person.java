import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Person {
    @Id
    private ObjectId objId;
    private String id;
    private String nombre;
    private String apellidos;

    public Person() {

    }

    public ObjectId getObjId() {
        return objId;
    }

    public void setObjId(ObjectId objId) {
        this.objId = objId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    @Override
    public String toString() {
        return "Person{" +
                "objId=" + objId +
                ", id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
