package com.laboratorio.tienda.controller;

import com.laboratorio.tienda.models.Productos;
import com.laboratorio.tienda.service.ProductosService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequiredArgsConstructor
@Slf4j
@Tag(name = "Products Controller", description = "Microservicio encargado de exponer operaciones CRUD sobre productos alojados en una base de datos en memoria.")
public class ProductsController {

    private final ProductosService service;

    @GetMapping("/products")
    @Operation(
            operationId = "Obtener productos",
            description = "Operacion de lectura",
            summary = "Se devuelve una lista de todos los productos almacenados en la base de datos.")
    @ApiResponse(
            responseCode = "200",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Productos.class)))
    public ResponseEntity<List<Productos>> getProducts(
            @RequestHeader Map<String, String> headers,
            @Parameter(name = "nombre", description = "Nombre del producto. No tiene por que ser exacto", example = "iPhone", required = false)
            @RequestParam(required = false) String nombre,
            @Parameter(name = "descripcion", description = "País del producto. Debe ser exacto", example = "ES", required = false)
            @RequestParam(required = false) String descripcion,
            @Parameter(name = "costo", description = "Descripcion del producto. No tiene por que ser exacta", example = "Estupendo", required = false)
            @RequestParam(required = false) Float costo,
            @Parameter(name = "utilidad", description = "Estado del producto. true o false", example = "true", required = false)
            @RequestParam(required = false) Float utilidad,
            @Parameter(name = "cantidad", description = "Estado del producto. true o false", example = "true", required = false)
            @RequestParam(required = false) Integer cantidad,
            @Parameter(name = "precioUni", description = "Estado del producto. true o false", example = "true", required = false)
            @RequestParam(required = false) Float precioUni

            )

    {


        log.info("headers: {}", headers);
        List<Productos> products = service.getProducts(nombre, descripcion, costo, utilidad, cantidad, precioUni);

        if (products != null) {
            return ResponseEntity.ok(products);
        } else {
            return ResponseEntity.ok(Collections.emptyList());
        }
    }


}
