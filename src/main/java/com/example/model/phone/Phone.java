package com.example.model.phone;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, length = 50)
	private String brand;
	@Column(nullable = false, length = 50)
	private String model;
	@Column(nullable = false)
	private Processor processor;
	@Column(nullable = false)
	private Ram ram;
	@Column(nullable = false)
	private Screen screen;
	@Column(nullable = false)
	private Battery batery;
	@Column(nullable = false)
	private long antutu;
	@Column(nullable = false)
	private float prize;
	
	public Phone(BuilderPhone builderPhone) {
		this.brand = builderPhone.getMark();
		this.model = builderPhone.getModel();
		this.processor = builderPhone.getProcessor();
		this.ram = builderPhone.getRam();
		this.screen = builderPhone.getScreen();
		this.batery = builderPhone.getBatery();
		this.antutu = builderPhone.getAntutu();
		this.prize = builderPhone.getPrize();
	}

	public Phone() {
		super();
	}

	public String getMark() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public Processor getProcessor() {
		return processor;
	}

	public Ram getRam() {
		return ram;
	}
	
	public Screen getScreen() {
		return screen;
	}

	public Battery getBatery() {
		return batery;
	}

	public long getAntutu() {
		return antutu;
	}

	public float getPrize() {
		return prize;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(antutu, batery, brand, id, model, prize, processor, ram, screen);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		return antutu == other.antutu && Objects.equals(batery, other.batery) && Objects.equals(brand, other.brand)
				&& id == other.id && Objects.equals(model, other.model)
				&& Float.floatToIntBits(prize) == Float.floatToIntBits(other.prize)
				&& Objects.equals(processor, other.processor) && Objects.equals(ram, other.ram)
				&& Objects.equals(screen, other.screen);
	}

	@Override
	public String toString() {
		return "Phone [mark=" + brand + ", model=" + model + ", processor=" + processor + ", ram=" + ram + ", screen="
				+ screen + ", batery=" + batery + ", antutu=" + antutu + ", prize=" + prize + "]";
	}
	
}
