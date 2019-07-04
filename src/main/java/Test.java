import java.lang.annotation.*;

/**
 * Indicates that the annotated method is a test method.
 * This annotation should be used only on parameterless
 * static methods.
 */
/*
Note that annotation type declaration is itself annoted.
Such annotations are called meta-annotations. The first
@Retention(RetentionPolicy.RUNTIME) indicates that annotations
with this type are to be retained by the VM so they can be
read reflectivity at run-time. The second (@Target(ElementType.METHOD))
indicates that this annotation type can be used to annotate only method declarations.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
}
