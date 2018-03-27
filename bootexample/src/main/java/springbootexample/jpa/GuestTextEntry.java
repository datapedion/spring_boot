package springbootexample.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "GuestText" )
public class GuestTextEntry {

	@Id
	@GeneratedValue
	private long	id;

	private String	text;

	public GuestTextEntry( final String text ) {

		this.text = text;
	}

	public long getId() {

		return id;
	}

	public void setId( long id ) {

		this.id = id;
	}

	public String getText() {

		return text;
	}

	public void setText( String text ) {

		this.text = text;
	}

}
