package at.technikum.springrestbackend.dto;

import jakarta.validation.constraints.NotBlank;

public class PictureDto {
    private Long id;
    @NotBlank(message = "fileLink is mendatory")
    private String fileLink;


    public PictureDto() {
    }

    public PictureDto(Long id, String fileLink) {
        this.id = id;
        this.fileLink = fileLink;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }
}
