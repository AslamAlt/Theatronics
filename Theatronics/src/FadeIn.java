//package sample;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


public class FadeIn extends AnimationFX {

	public FadeIn(Node node) {
		super(node);
	}

	public FadeIn() {
	}

	@Override
	AnimationFX resetNode() {
		return this;
	}

	@Override
	void initTimeline() {
		setTimeline(new Timeline(
				new KeyFrame(Duration.millis(0),
						new KeyValue(getNode().opacityProperty(), 0, AnimateFXInterpolator.EASE)
				),
				new KeyFrame(Duration.millis(300),
						new KeyValue(getNode().opacityProperty(), 1, AnimateFXInterpolator.EASE)
				)

		));
	}
}
