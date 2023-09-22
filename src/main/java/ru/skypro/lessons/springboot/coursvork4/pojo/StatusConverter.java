//package ru.skypro.lessons.springboot.coursvork4.pojo;
//
//import jakarta.persistence.AttributeConverter;
//import jakarta.persistence.Converter;
//import ru.skypro.lessons.springboot.coursvork4.service.Status;
//
//import java.util.stream.Stream;
//
//@Converter(autoApply = true)
//public class StatusConverter implements AttributeConverter<Status, String> {
//
//    @Override
//    public String convertToDatabaseColumn(Status status) {
//        if(status == null){
//            return null;
//        }
//        return status.getTypeStatus();
//    }
//
//    @Override
//    public Status convertToEntityAttribute(String s) {
//        if(s == null){
//            return null;
//        }
//        return Stream.of(Status.values())
//                .filter(x->x.getTypeStatus().equals(s))
//                .findFirst()
//                .orElseThrow(IllegalAccessError::new);
//    }
//}
