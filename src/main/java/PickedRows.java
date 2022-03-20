import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PickedRows {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pickedRowsId;

    private Long pickedRows;
    private double pickedWeight;

    @ManyToOne
    @JoinColumn(name = "departmentId")
    private Department department;

}
