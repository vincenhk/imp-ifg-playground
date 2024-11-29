package co.imp.tech.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "m_lookup")
public class Lookup {

    @Id
    @Column(name = "lookup_key", length = 150)
    private String lookupKey;

    @Column(name = "lookup_group", length = 50, nullable = false)
    private String lookupGroup;

    @Column(name = "key_only", length = 50, nullable = false)
    private String keyOnly;

    @Column(name = "label", length = 255, nullable = false)
    private String label;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    @Column(name = "version", nullable = false)
    private Integer version;

    @Column(name = "created_by", length = 100, nullable = false)
    private String createdBy;

    @Column(name = "created_date", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "modified_by", length = 100)
    private String modifiedBy;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;
}