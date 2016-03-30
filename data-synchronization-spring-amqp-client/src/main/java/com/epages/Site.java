package com.epages;

import static lombok.AccessLevel.NONE;
import static lombok.AccessLevel.PRIVATE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = PRIVATE)
@RequiredArgsConstructor
@ToString
public class Site {

    @Id
    @GeneratedValue
    @Setter(NONE)
    private Long id;

    @NonNull
    @Column(nullable = false)
    private Long tenantId;

    @ManyToOne(optional = false)
    private BusinessUnit businessUnitRef;
}
