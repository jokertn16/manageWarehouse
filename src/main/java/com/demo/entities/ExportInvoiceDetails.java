package com.demo.entities;
// Generated Jan 20, 2022, 9:21:20 AM by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ExportInvoiceDetails generated by hbm2java
 */
@Entity
@Table(name = "export_invoice_details", catalog = "qlkh")
public class ExportInvoiceDetails implements java.io.Serializable {

	private ExportInvoiceDetailsId id;
	private ExportInvoice exportInvoice;
	private Product product;
	private double price;
	private int quantity;

	public ExportInvoiceDetails() {
	}

	public ExportInvoiceDetails(ExportInvoiceDetailsId id, ExportInvoice exportInvoice, Product product, double price,
			int quantity) {
		this.id = id;
		this.exportInvoice = exportInvoice;
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idInvoice", column = @Column(name = "id_invoice", nullable = false)),
			@AttributeOverride(name = "idPro", column = @Column(name = "id_pro", nullable = false)) })
	public ExportInvoiceDetailsId getId() {
		return this.id;
	}

	public void setId(ExportInvoiceDetailsId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_invoice", nullable = false, insertable = false, updatable = false)
	public ExportInvoice getExportInvoice() {
		return this.exportInvoice;
	}

	public void setExportInvoice(ExportInvoice exportInvoice) {
		this.exportInvoice = exportInvoice;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pro", nullable = false, insertable = false, updatable = false)
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Column(name = "price", nullable = false, precision = 22, scale = 0)
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}