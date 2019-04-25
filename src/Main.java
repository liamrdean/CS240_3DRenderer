import com.jogamp.opengl.GL4;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.graph.geom.Vertex;
import com.jogamp.opengl.*;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.awt.GLCanvas;
import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame implements GLEventListener {
    private static final long serialVersionUID = 1L;

    private int width = 800;
    private int height = 600;

    public static void main(String[] args) {
        Main main = new Main();
    }

    public Main() {
        super("Minimal OpenGL");
        GLProfile profile = GLProfile.get(GLProfile.GL4);
        GLCapabilities capabilities = new GLCapabilities(profile);

        GLCanvas canvas = new GLCanvas(capabilities);
        canvas.addGLEventListener(this);

        this.setName("3D Renderer");
        this.getContentPane().add(canvas);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(true);
        canvas.requestFocusInWindow();

    }

    @Override
    public void init(GLAutoDrawable glAutoDrawable) {
        GL4 gl = glAutoDrawable.getGL().getGL4();
        //               Red      Green    Blue   Alpha
        gl.glClearColor(0.0f, 0.0f, 1f, 0.5f);
    }

    @Override
    public void dispose(GLAutoDrawable glAutoDrawable) {

    }

    @Override
    public void display(GLAutoDrawable glAutoDrawable) {
        GL4 gl = glAutoDrawable.getGL().getGL4();
        gl.glClear(GL4.GL_COLOR_BUFFER_BIT | GL4.GL_DEPTH_BUFFER_BIT);

        gl.glFlush();

    }

    @Override
    public void reshape(GLAutoDrawable glAutoDrawable, int i, int i1, int i2, int i3) {

    }
}
