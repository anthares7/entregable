-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-06-2025 a las 12:21:22
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dbhospital`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `beds`
--

CREATE TABLE `beds` (
  `bed_id` int(11) NOT NULL,
  `bed_number` int(11) NOT NULL,
  `bed_location` varchar(20) NOT NULL,
  `ward_number` int(11) NOT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `diagnoses`
--

CREATE TABLE `diagnoses` (
  `diagnosis_id` int(11) NOT NULL,
  `patient_id` int(11) NOT NULL,
  `diagnosis_by_doctor_id` int(11) NOT NULL,
  `diagnosis_details` varchar(200) NOT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `doctors`
--

CREATE TABLE `doctors` (
  `staff_id` int(11) NOT NULL,
  `doctor_name` varchar(25) NOT NULL,
  `doctor_lastname` varchar(25) NOT NULL,
  `doctor_date_of_birth` date DEFAULT NULL,
  `doctor_age` int(11) NOT NULL,
  `speciality` varchar(25) NOT NULL,
  `phone` varchar(9) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `hostipal_id` int(11) DEFAULT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `doctors_assigned_to_patients`
--

CREATE TABLE `doctors_assigned_to_patients` (
  `da_to_patients_id` int(11) NOT NULL,
  `patient_id` int(11) NOT NULL,
  `staff_id` int(11) NOT NULL,
  `date_from` date NOT NULL,
  `date_to` date NOT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `drugs`
--

CREATE TABLE `drugs` (
  `drug_id` int(11) NOT NULL,
  `drug_name` varchar(20) NOT NULL,
  `drug_description` varchar(20) NOT NULL,
  `drug_cost` int(11) NOT NULL,
  `drug_cost_unit` varchar(2) NOT NULL,
  `other_details` varchar(50) NOT NULL,
  `drug_category_code` int(11) NOT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `patients`
--

CREATE TABLE `patients` (
  `patient_id` int(11) NOT NULL,
  `patient_name` varchar(25) NOT NULL,
  `patient_lastname` varchar(25) NOT NULL,
  `patient_date_of_birth` date NOT NULL,
  `patient_gender` char(1) NOT NULL,
  `patient_height` int(11) NOT NULL,
  `patient_weight` int(11) NOT NULL,
  `phone` varchar(9) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `patients_in_beds`
--

CREATE TABLE `patients_in_beds` (
  `pb_id` int(11) NOT NULL,
  `date_from` date NOT NULL,
  `bed_id` int(11) NOT NULL,
  `patient_id` int(11) NOT NULL,
  `date_to` date NOT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `patient_drugs_treatments`
--

CREATE TABLE `patient_drugs_treatments` (
  `pd_treatments` int(11) NOT NULL,
  `date_administered` date NOT NULL,
  `comments` varchar(100) NOT NULL,
  `patient_id` int(11) NOT NULL,
  `diagnosis_id` int(11) NOT NULL,
  `drug_id` int(11) NOT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `patient_records`
--

CREATE TABLE `patient_records` (
  `patient_record_id` int(11) NOT NULL,
  `billable_item_code` varchar(10) NOT NULL,
  `component_code` varchar(10) NOT NULL,
  `update_by_staff_id` int(11) NOT NULL,
  `updated_date` date NOT NULL,
  `admission_datetime` date NOT NULL,
  `medical_condition` varchar(20) NOT NULL,
  `patient_id` int(11) NOT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ref_drug_categories`
--

CREATE TABLE `ref_drug_categories` (
  `drug_category_code` int(11) NOT NULL,
  `drug_category_description` varchar(200) NOT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `wards`
--

CREATE TABLE `wards` (
  `ward_number` int(11) NOT NULL,
  `ward_name` varchar(20) NOT NULL,
  `ward_location` varchar(20) NOT NULL,
  `ward_description` varchar(100) NOT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `beds`
--
ALTER TABLE `beds`
  ADD PRIMARY KEY (`bed_id`),
  ADD KEY `ward_number` (`ward_number`);

--
-- Indices de la tabla `diagnoses`
--
ALTER TABLE `diagnoses`
  ADD PRIMARY KEY (`diagnosis_id`),
  ADD KEY `patient_id` (`patient_id`),
  ADD KEY `diagnosis_by_doctor_id` (`diagnosis_by_doctor_id`);

--
-- Indices de la tabla `doctors`
--
ALTER TABLE `doctors`
  ADD PRIMARY KEY (`staff_id`);

--
-- Indices de la tabla `doctors_assigned_to_patients`
--
ALTER TABLE `doctors_assigned_to_patients`
  ADD PRIMARY KEY (`da_to_patients_id`),
  ADD KEY `staff_id` (`staff_id`),
  ADD KEY `patient_id` (`patient_id`);

--
-- Indices de la tabla `drugs`
--
ALTER TABLE `drugs`
  ADD PRIMARY KEY (`drug_id`),
  ADD KEY `drug_category_code` (`drug_category_code`);

--
-- Indices de la tabla `patients`
--
ALTER TABLE `patients`
  ADD PRIMARY KEY (`patient_id`);

--
-- Indices de la tabla `patients_in_beds`
--
ALTER TABLE `patients_in_beds`
  ADD PRIMARY KEY (`pb_id`),
  ADD KEY `patient_id` (`patient_id`),
  ADD KEY `bed_id` (`bed_id`);

--
-- Indices de la tabla `patient_drugs_treatments`
--
ALTER TABLE `patient_drugs_treatments`
  ADD PRIMARY KEY (`pd_treatments`),
  ADD KEY `patient_id` (`patient_id`),
  ADD KEY `drug_id` (`drug_id`),
  ADD KEY `diagnosis_id` (`diagnosis_id`);

--
-- Indices de la tabla `patient_records`
--
ALTER TABLE `patient_records`
  ADD PRIMARY KEY (`patient_record_id`),
  ADD KEY `patient_id` (`patient_id`);

--
-- Indices de la tabla `ref_drug_categories`
--
ALTER TABLE `ref_drug_categories`
  ADD PRIMARY KEY (`drug_category_code`);

--
-- Indices de la tabla `wards`
--
ALTER TABLE `wards`
  ADD PRIMARY KEY (`ward_number`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `beds`
--
ALTER TABLE `beds`
  MODIFY `bed_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `diagnoses`
--
ALTER TABLE `diagnoses`
  MODIFY `diagnosis_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `doctors`
--
ALTER TABLE `doctors`
  MODIFY `staff_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `doctors_assigned_to_patients`
--
ALTER TABLE `doctors_assigned_to_patients`
  MODIFY `da_to_patients_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `drugs`
--
ALTER TABLE `drugs`
  MODIFY `drug_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `patients`
--
ALTER TABLE `patients`
  MODIFY `patient_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `patients_in_beds`
--
ALTER TABLE `patients_in_beds`
  MODIFY `pb_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `patient_drugs_treatments`
--
ALTER TABLE `patient_drugs_treatments`
  MODIFY `pd_treatments` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `patient_records`
--
ALTER TABLE `patient_records`
  MODIFY `patient_record_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ref_drug_categories`
--
ALTER TABLE `ref_drug_categories`
  MODIFY `drug_category_code` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `wards`
--
ALTER TABLE `wards`
  MODIFY `ward_number` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `beds`
--
ALTER TABLE `beds`
  ADD CONSTRAINT `beds_ibfk_1` FOREIGN KEY (`ward_number`) REFERENCES `wards` (`ward_number`);

--
-- Filtros para la tabla `diagnoses`
--
ALTER TABLE `diagnoses`
  ADD CONSTRAINT `diagnoses_ibfk_1` FOREIGN KEY (`patient_id`) REFERENCES `patients` (`patient_id`),
  ADD CONSTRAINT `diagnoses_ibfk_2` FOREIGN KEY (`diagnosis_by_doctor_id`) REFERENCES `doctors` (`staff_id`);

--
-- Filtros para la tabla `doctors_assigned_to_patients`
--
ALTER TABLE `doctors_assigned_to_patients`
  ADD CONSTRAINT `doctors_assigned_to_patients_ibfk_1` FOREIGN KEY (`staff_id`) REFERENCES `doctors` (`staff_id`),
  ADD CONSTRAINT `doctors_assigned_to_patients_ibfk_2` FOREIGN KEY (`patient_id`) REFERENCES `patients` (`patient_id`);

--
-- Filtros para la tabla `drugs`
--
ALTER TABLE `drugs`
  ADD CONSTRAINT `drugs_ibfk_1` FOREIGN KEY (`drug_category_code`) REFERENCES `ref_drug_categories` (`drug_category_code`);

--
-- Filtros para la tabla `patients_in_beds`
--
ALTER TABLE `patients_in_beds`
  ADD CONSTRAINT `patients_in_beds_ibfk_1` FOREIGN KEY (`patient_id`) REFERENCES `patients` (`patient_id`),
  ADD CONSTRAINT `patients_in_beds_ibfk_2` FOREIGN KEY (`bed_id`) REFERENCES `beds` (`bed_id`);

--
-- Filtros para la tabla `patient_drugs_treatments`
--
ALTER TABLE `patient_drugs_treatments`
  ADD CONSTRAINT `patient_drugs_treatments_ibfk_1` FOREIGN KEY (`patient_id`) REFERENCES `patients` (`patient_id`),
  ADD CONSTRAINT `patient_drugs_treatments_ibfk_2` FOREIGN KEY (`drug_id`) REFERENCES `drugs` (`drug_id`),
  ADD CONSTRAINT `patient_drugs_treatments_ibfk_3` FOREIGN KEY (`diagnosis_id`) REFERENCES `diagnoses` (`diagnosis_id`);

--
-- Filtros para la tabla `patient_records`
--
ALTER TABLE `patient_records`
  ADD CONSTRAINT `patient_records_ibfk_1` FOREIGN KEY (`patient_id`) REFERENCES `patients` (`patient_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
