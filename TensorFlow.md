# **Project Template: Getting Started with TensorFlow**

## **Tools and Technologies:**

- **Primary Framework**: TensorFlow
- **Additional Libraries**: None required for the basic example.

## **Setup and Installation:**

1. Install TensorFlow with CUDA using pip:

   ```bash
   pip install tensorflow[and-cuda]
   ```

2. Verify the installation by running the following Python commands:

   ```python
   import tensorflow as tf
   print("TensorFlow version:", tf.__version__)
   ```

* For the specific installation process, refer to the [Official Install Document](https://www.tensorflow.org/install/pip#linux).

## **Basic TensorFlow Operations:**

1. Perform a simple addition operation using TensorFlow:

   ```python
   import tensorflow as tf
   
   # Define constants
   const1 = tf.constant([[1,2,3], [1,2,3]])
   const2 = tf.constant([[3,4,5], [3,4,5]])
   
   # Perform addition
   result = tf.add(const1, const2)
   
   # In TensorFlow 2.x, you can directly obtain the numerical values using the numpy() method
   print(result.numpy())
   ```

## **Building a Simple Machine Learning Model:**

1. Load a dataset, build, and train a machine learning model using TensorFlow:

   ```python
   import tensorflow as tf
   
   # Load the MNIST dataset
   mnist = tf.keras.datasets.mnist
   (x_train, y_train), (x_test, y_test) = mnist.load_data()
   x_train, x_test = x_train / 255.0, x_test / 255.0
   
   # Build a tf.keras.Sequential model
   model = tf.keras.models.Sequential([
     tf.keras.layers.Flatten(input_shape=(28, 28)),
     tf.keras.layers.Dense(128, activation='relu'),
     tf.keras.layers.Dropout(0.2),
     tf.keras.layers.Dense(10)
   ])
   ```

## **Running the Model:**

1. Compile and train the model:

   ```python
   model.compile(optimizer='adam',
                 loss=tf.keras.losses.SparseCategoricalCrossentropy(from_logits=True),
                 metrics=['accuracy'])
   
   # Train the model
   model.fit(x_train, y_train, epochs=5)
   
   # Evaluate the model
   model.evaluate(x_test,  y_test, verbose=2)
   ```

## **Template Author:**

- Name: Jiaying Wang   Email: wangj63@rpi.edu

## **References:**

- TensorFlow 2 Quickstart for Beginners: [TensorFlow Official Documentation](https://www.tensorflow.org/tutorials/quickstart/beginner)
- TensorFlow Gradient Example: [TensorFlow Core](https://www.tensorflow.org/guide/autodiff)
- TensorFlow Placeholders and Filters Example: [RipTutorial](https://riptutorial.com/tensorflow/example/31823/basic-rnn-example-in-tensorflow)
