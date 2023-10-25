# **Project Template: Real-Time Object Detection Using Pytorch With Pre-trained YOLOv8**


## **Project Description:**
This template aims to explore the capabilities of the pre-trained YOLOv8 model in real-time object detection scenarios. Participants will implement and optimize the YOLOv8 model to detect and classify various objects in real-time video streams, utilizing the model's pre-trained weights to achieve high accuracy and speed.

## **Tools and Technologies:**
- **Primary Framework**: PyTorch
- **Model**: YOLOv8
- **Additional Libraries**: OpenCV, Ultralytics YOLO library, etc.

## **Setup and Installation:**
1. Install PyTorch, OpenCV, and other necessary libraries.
2. Download a pre-trained YOLOv8 model or use the provided `yolov8n.pt` file.

## **Dataset (Optional):**
- Use publicly available datasets to training models.
- Data preparation is crucial for achieving specific accurate detection.

## **Example of Model Implementation:**
1. Load the pre-trained YOLOv8 model using the Ultralytics YOLO library.
2. Utilize the model to perform real-time object detection on live video streams.

```python
#Example File:
import cv2
from ultralytics import YOLO

# Load the YOLOv8 model
model = YOLO('yolov8n.pt')

# Open the video file
video_path = "http://admin:admin@192.168.137.188:8081/live.flv"
cap = cv2.VideoCapture(video_path)

# Loop through the video frames
while cap.isOpened():
    # Read a frame from the video
    success, frame = cap.read()

    if success:
        # Run YOLOv8 inference on the frame
        for result in model(frame, stream=True):
            annotated_frame = result.plot()
            cv2.imshow("YOLOv8 Inference", annotated_frame)
            if cv2.waitKey(1) & 0xFF == ord("q"):
                break

    else:
        # Break the loop if the end of the video is reached
        break

# Release the video capture object and close the display window
cap.release()
cv2.destroyAllWindows()
```

## **Model Evaluation and Optimization:**
1. Evaluate the model performance in real-time object detection scenarios.
2. Optimize the model for better accuracy and speed, if necessary.

## **Deployment:**
1. Deploy the model for real-time object detection on a web server or a local machine.
2. Create a user-friendly interface for interacting with the model.

## **Performance Analysis:**
- Analyze the performance of the model in different real-time object detection scenarios.

## **Documentation:**
- Provide comprehensive documentation covering the setup, implementation, evaluation, and deployment steps.
- Include troubleshooting steps and references for further reading.

## **Template Author:**
- Name: Jiaying Wang   Email: wangj63@rpi.edu

## **References:**

https://github.com/ultralytics/ultralytics

https://docs.ultralytics.com/modes/predict/#inference-sources